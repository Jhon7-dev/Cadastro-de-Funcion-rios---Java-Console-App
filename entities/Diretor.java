package cadastroFuncionario_e_Gerente;

public class Diretor extends Funcionario{
    private double bonusResultado;
    private int tempoTrabalho;



    public Diretor(String nome, String cpf, Double salario, String cargo, int tempoTrabalho) {
        super(nome, cpf, salario, cargo);
        this.tempoTrabalho = tempoTrabalho;
        this.calcularBonus();

    }
    private void calcularBonus() {
        if (this.tempoTrabalho >= 5) {
            this.bonusResultado = 5000.0;
        } else {
            this.bonusResultado = 0.0;
            System.out.println("SEM BONIFICAÇÃO");
        }
    }
    public double getBonusResultado() {
        return bonusResultado;
    }


    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
        this.calcularBonus();
    }

    @Override
    public Double calcularSalarioLiquido(){
        double desconto = getSalario()*0.15;
        return (getSalario() - desconto) + bonusResultado;
    }
    @Override
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Tempo de Trabalho: " + tempoTrabalho + " anos" );
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
        System.out.println("Bõnus Resultado: " + this.bonusResultado);
    }
}
