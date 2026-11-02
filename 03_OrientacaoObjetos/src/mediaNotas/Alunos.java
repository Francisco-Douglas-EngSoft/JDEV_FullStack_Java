package mediaNotas;

public class Alunos {
    String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;   
    private double nota1;
    private double nota2;
    private double nota3;

    public Alunos() {
    }
    
    public Alunos(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae, String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.numeroCpf = numeroCpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;
    }

    //Metodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
