package cadastroFuncionario_e_Gerente;

public class Estagiario extends Funcionario {

    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, Double salario, String cargo,double bolsaAuxilio) {
        super(nome, cpf, salario, cargo);
        this.bolsaAuxilio=bolsaAuxilio;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
    @Override
    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Bolsa Auxilío: " + getBolsaAuxilio());
    }
}
