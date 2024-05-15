package usuario.getandpost.model;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String contato;
    private String cpfCnpj;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor com todos os campos
    public Usuario(String id, String nome, String email, String login, String senha, String contato, String cpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.contato = contato;
        this.cpfCnpj = cpfCnpj;
    }

    // Getter e setter para o campo 'id'
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getters e setters para os outros campos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
