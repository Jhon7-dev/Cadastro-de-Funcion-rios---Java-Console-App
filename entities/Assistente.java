package cadastroFuncionario_e_Gerente;

public class Assistente extends Funcionario{

    private double bonuFixo;
    private double salarioTotal;

    public Assistente(String nome, String cpf, Double salario, String cargo, double bonuFixo) {
        super(nome, cpf, salario, cargo);
        this.bonuFixo = bonuFixo;

    }

    public double getSalarioTotal() {
        return this.getSalario() + this.getBonuFixo();
    }

    public void setSalarioTotal(double salarioTotal) {

        this.salarioTotal = this.getSalario() + this.getBonuFixo();
    }

    public double getBonuFixo() {
        return bonuFixo;
    }

    public void setBonuFixo(double bonuFixo) {
        this.bonuFixo = bonuFixo;
    }


    @Override
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Bônus Fixo: " + getBonuFixo());
        System.out.println("Salário Líquido: " + getSalario());
        System.out.println("Salário Total: " + getSalarioTotal());
    }
}
