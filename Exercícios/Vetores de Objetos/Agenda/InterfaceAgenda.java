import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Locale;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** Interface de demonstração da Agenda, com fontes grandes para projeção. */
public class InterfaceAgenda extends JFrame {
	private static final Font ROTULO = new Font("SansSerif", Font.BOLD, 22);
	private static final Font CAMPO = new Font("SansSerif", Font.PLAIN, 22);
	private static final Font BOTAO = new Font("SansSerif", Font.BOLD, 20);
	private static final Font RESULTADO = new Font("Monospaced", Font.PLAIN, 22);
	private static final String[] MESES = {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

	private final Agenda agenda;
	private final JTextField nome = new JTextField(18);
	private final JTextField dia = new JTextField(4);
	private final JTextField telefone = new JTextField(14);
	private final JComboBox<String> mes = new JComboBox<String>(MESES);
	private final JTextArea saida = new JTextArea();

	private InterfaceAgenda() {
		agenda = new Agenda("Agenda da turma", 100);
		setTitle("Agenda de contatos — demonstração");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(1050, 720));
		setLayout(new BorderLayout(14, 14));

		JLabel titulo = new JLabel("AGENDA DE CONTATOS", JLabel.CENTER);
		titulo.setFont(new Font("SansSerif", Font.BOLD, 34));
		titulo.setBorder(BorderFactory.createEmptyBorder(16, 10, 4, 10));
		add(titulo, BorderLayout.NORTH);

		JPanel centro = new JPanel(new BorderLayout(12, 12));
		centro.setBorder(BorderFactory.createEmptyBorder(4, 18, 18, 18));
		centro.add(criarFormulario(), BorderLayout.NORTH);
		saida.setFont(RESULTADO);
		saida.setEditable(false);
		saida.setLineWrap(false);
		saida.setText("Cadastre um contato ou escolha uma operação.\nAgenda: " + agenda.getNomeDaAgenda()
				+ " | Contatos cadastrados: " + agenda.getTotalContatos());
		JScrollPane rolagem = new JScrollPane(saida);
		rolagem.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Resultados"));
		centro.add(rolagem, BorderLayout.CENTER);
		add(centro, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
	}

	private JPanel criarFormulario() {
		JPanel painel = new JPanel(new GridBagLayout());
		painel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Dados do contato e operações"));
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(8, 8, 8, 8);
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.HORIZONTAL;
		adicionar(painel, new JLabel("Nome:"), c, 0, 0);
		adicionar(painel, estilizar(nome), c, 1, 0);
		adicionar(painel, new JLabel("Dia:"), c, 2, 0);
		adicionar(painel, estilizar(dia), c, 3, 0);
		adicionar(painel, new JLabel("Mês:"), c, 4, 0);
		mes.setFont(CAMPO);
		adicionar(painel, mes, c, 5, 0);
		adicionar(painel, new JLabel("Telefone:"), c, 0, 1);
		adicionar(painel, estilizar(telefone), c, 1, 1);

		JPanel botoes = new JPanel(new java.awt.GridLayout(3, 3, 10, 10));
		adicionarBotao(botoes, "Cadastrar", this::cadastrar);
		adicionarBotao(botoes, "Buscar nome", this::buscar);
		adicionarBotao(botoes, "Alterar", this::alterar);
		adicionarBotao(botoes, "Remover", this::remover);
		adicionarBotao(botoes, "Todos os contatos", this::listarTodos);
		adicionarBotao(botoes, "Aniversariantes", this::listarAniversariantes);
		adicionarBotao(botoes, "Telefones", this::listarTelefones);
		adicionarBotao(botoes, "Limpar campos", this::limpar);
		adicionarBotao(botoes, "Gerar dados de teste", this::gerarDadosDeTeste);
		c.gridx = 0; c.gridy = 2; c.gridwidth = 6; c.weightx = 1;
		painel.add(botoes, c);
		for (java.awt.Component componente : painel.getComponents())
			if (componente instanceof JLabel) ((JLabel) componente).setFont(ROTULO);
		return painel;
	}

	private void adicionar(JPanel painel, java.awt.Component comp, GridBagConstraints base, int x, int y) {
		GridBagConstraints c = (GridBagConstraints) base.clone();
		c.gridx = x; c.gridy = y;
		if (x == 1) c.weightx = 1;
		painel.add(comp, c);
	}

	private JTextField estilizar(JTextField campo) { campo.setFont(CAMPO); return campo; }
	private void adicionarBotao(JPanel painel, String texto, Runnable acao) {
		JButton botao = new JButton(texto);
		botao.setFont(BOTAO);
		botao.setPreferredSize(new Dimension(205, 56));
		botao.addActionListener(e -> tratarExcecoes(acao));
		painel.add(botao);
	}

	private Pessoa lerPessoa(boolean dadosCompletos) {
		String n = nome.getText().trim();
		if (n.isEmpty()) throw new IllegalArgumentException("Informe o nome do contato.");
		if (!dadosCompletos) return new Pessoa(n);
		int d = dia.getText().trim().isEmpty() ? 0 : Integer.parseInt(dia.getText().trim());
		int m = mes.getSelectedIndex();
		String tel = telefone.getText().trim().isEmpty() ? "Indefinido" : telefone.getText().trim();
		if (d < 0 || d > 31 || m < 0 || m > 12 || (d == 0) != (m == 0))
			throw new IllegalArgumentException("Informe uma data válida: dia 1–31 e mês 1–12, ou deixe ambos vazios.");
		return new Pessoa(n, d, m, tel);
	}

	private void tratarExcecoes(Runnable acao) {
		try {
			acao.run();
		} catch (NumberFormatException ex) {
			mostrarErro("O dia precisa ser um número. Confira o valor digitado.", ex);
		} catch (IllegalArgumentException ex) {
			mostrarErro(ex.getMessage() == null ? "Um dos valores informados não é válido." : ex.getMessage(), ex);
		} catch (RuntimeException ex) {
			mostrarErro("Ocorreu um erro inesperado ao executar esta operação. "
					+ "Isso pode indicar um problema no código da Agenda. Consulte o tipo e o detalhe abaixo.", ex);
		}
	}
	private void mostrarErro(String explicacao, RuntimeException ex) {
		String detalhe = ex.getMessage();
		if (detalhe == null || detalhe.trim().isEmpty()) detalhe = "Sem mensagem adicional.";
		mostrar("ERRO: " + explicacao + "\n\nTipo: " + ex.getClass().getSimpleName()
				+ "\nDetalhe: " + detalhe + "\n\nRevise os dados e, se o erro persistir, confira a implementação da classe Agenda.");
	}
	private void executar(Runnable acao) { tratarExcecoes(acao); }
	private void cadastrar() { executar(() -> { boolean ok = agenda.adicionaPessoa(lerPessoa(true)); mostrar(ok ? "Contato cadastrado." : "Não foi possível cadastrar: nome repetido ou agenda cheia."); }); }
	private void buscar() { executar(() -> { Pessoa p = agenda.buscaContato(lerPessoa(false).getNome()); mostrar(p == null ? "Contato não encontrado." : formatar(p)); }); }
	private void alterar() { executar(() -> { boolean ok = agenda.alteraInformacoes(lerPessoa(true)); mostrar(ok ? "Contato alterado." : "Contato não encontrado."); }); }
	private void remover() { executar(() -> { boolean ok = agenda.removePessoa(lerPessoa(false)); mostrar(ok ? "Contato removido." : "Contato não encontrado."); }); }
	private void listarTodos() { Pessoa[] pessoas = agenda.buscaPessoas(); StringBuilder b = new StringBuilder("Contatos cadastrados: ").append(pessoas.length).append("\n\n"); for (Pessoa p : pessoas) b.append(formatar(p)).append("\n"); mostrar(b.toString()); }
	private void listarAniversariantes() {
		int numeroMes = mes.getSelectedIndex();
		if (numeroMes == 0) { mensagem("Selecione o mês no campo Mês."); return; }
		Pessoa[] cadastrados = agenda.buscaPessoas();
		int quantidade = 0;
		for (Pessoa pessoa : cadastrados)
			if (pessoa.getMesDeNascimento() == numeroMes && pessoa.getDiaDeNascimento() > 0) quantidade++;

		Pessoa[] pessoas = new Pessoa[quantidade];
		int indice = 0;
		for (Pessoa pessoa : cadastrados)
			if (pessoa.getMesDeNascimento() == numeroMes && pessoa.getDiaDeNascimento() > 0)
				pessoas[indice++] = pessoa;

		// A ordenação é feita neste vetor local; Agenda continua responsável apenas pelo armazenamento e busca.
		for (int i = 1; i < pessoas.length; i++) {
			Pessoa atual = pessoas[i];
			int j = i - 1;
			while (j >= 0 && pessoas[j].getDiaDeNascimento() > atual.getDiaDeNascimento()) {
				pessoas[j + 1] = pessoas[j];
				j--;
			}
			pessoas[j + 1] = atual;
		}
		StringBuilder b = new StringBuilder("Aniversariantes de ").append(MESES[numeroMes]).append(" (ordenados por dia)\n\n");
		for (Pessoa p : pessoas) b.append(String.format(Locale.ROOT, "%02d/%02d  %s%n", p.getDiaDeNascimento(), p.getMesDeNascimento(), p.getNome()));
		if (pessoas.length == 0) b.append("Nenhum aniversariante cadastrado neste mês.");
		mostrar(b.toString());
	}
	private void listarTelefones() {
		Pessoa[] cadastrados = agenda.buscaPessoas();
		StringBuilder b = new StringBuilder("Contatos com telefone cadastrado\n\n");
		int quantidade = 0;
		for (Pessoa pessoa : cadastrados) {
			String tel = pessoa.getTelefone();
			if (tel != null && !tel.trim().isEmpty() && !tel.equalsIgnoreCase("Indefinido")) {
				b.append(pessoa.getNome()).append("  —  ").append(tel).append("\n");
				quantidade++;
			}
		}
		if (quantidade == 0) b.append("Nenhum contato possui telefone cadastrado.");
		mostrar(b.toString());
	}
	private void gerarDadosDeTeste() {
		String[] nomes = {"Ana Lima", "Bruno Costa", "Carla Souza", "Diego Alves", "Elisa Rocha", "Felipe Santos", "Giovana Melo", "Heitor Nunes", "Isabela Reis", "João Martins", "Laura Ribeiro", "Marcos Oliveira", "Natália Freitas", "Otávio Barros", "Paula Castro", "Rafael Dias"};
		Random aleatorio = new Random();
		int adicionados = 0;
		StringBuilder b = new StringBuilder("Dados de teste\n\n");
		for (int tentativas = 0; tentativas < nomes.length && adicionados < 12; tentativas++) {
			String n = nomes[aleatorio.nextInt(nomes.length)] + " " + (100 + aleatorio.nextInt(900));
			int d = 1 + aleatorio.nextInt(28);
			int m = 1 + aleatorio.nextInt(12);
			String tel = aleatorio.nextBoolean() ? String.format(Locale.ROOT, "(11) 9%04d-%04d", aleatorio.nextInt(10000), aleatorio.nextInt(10000)) : "Indefinido";
			if (agenda.adicionaPessoa(new Pessoa(n, d, m, tel))) {
				adicionados++;
				b.append(formatar(agenda.buscaContato(n))).append("\n");
			}
		}
		if (adicionados == 0) b.append("Nenhum contato foi adicionado. A agenda pode estar cheia.");
		else b.insert("Dados de teste\n\n".length(), "Adicionados: " + adicionados + "\n\n");
		mostrar(b.toString());
	}
	private String formatar(Pessoa p) { String data = p.getDiaDeNascimento() == 0 ? "sem aniversário" : String.format(Locale.ROOT, "%02d/%02d", p.getDiaDeNascimento(), p.getMesDeNascimento()); return p.getNome() + "  |  " + data + "  |  " + p.getTelefone(); }
	private void limpar() { nome.setText(""); dia.setText(""); mes.setSelectedIndex(0); telefone.setText(""); nome.requestFocusInWindow(); }
	private void mostrar(String texto) { saida.setText(texto); saida.setCaretPosition(0); }
	private void mensagem(String texto) { JOptionPane.showMessageDialog(this, texto, "Agenda", JOptionPane.INFORMATION_MESSAGE); }
	public static void main(String[] args) { SwingUtilities.invokeLater(() -> new InterfaceAgenda().setVisible(true)); }
}
