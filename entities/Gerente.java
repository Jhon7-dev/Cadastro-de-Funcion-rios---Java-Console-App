package cadastroFuncionario_e_Gerente;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, Double salario, String cargo) {
        super(nome, cpf, salario, cargo);

    }


    @Override
    public   Double calcularSalarioLiquido(){
        Double salarioLiquido;
        return  salarioLiquido = this.getSalario() * 0.8;
    }
    @Override
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
    }
}
