package cadastroFuncionario_e_Gerente;

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;

    public Funcionario(String nome,String cpf,Double salario,String cargo) {
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;
        this.cargo=cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public   Double calcularSalarioLiquido(){
        Double salarioLiquido;
        return  salarioLiquido = this.salario * 0.10;
    }
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
    }
}
