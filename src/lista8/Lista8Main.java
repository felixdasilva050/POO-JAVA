package lista8;

public class Lista8Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("guilherme","rua 08","(81)123456789", 200.00, 100.00);
        Empregado emp = new Empregado("emp", "rua 08", "(81)987654321", 1300.00, 10.00);
        Administrador adm = new Administrador("adm", "rua 08", "(81)987456352", 5000.00,10.00, 1000.00);
        Operario op = new Operario("op","rua 08", "(81)753951456",1600.00,10.00,25.00, 300.00);
        Vendedor vend = new Vendedor("vend", "rua 08", "(81)951321456", 1100.00,5.00, 23.00, 500.00);

        System.out.println("::::::::::::::::::vvvvv Fornecedor vvvv:::::::::::::::::::");
        System.out.println("valor saldo: " + f1.getBalance());
        f1.setCreditValue(1000.00);
        f1.setDebtValue(200.00);
        System.out.println("valor crédito: " + f1.getCreditValue() + " valor divida: " + f1.getDebtValue());
        System.out.println("::::::::::::::::::vvvvv Empregado vvvv:::::::::::::::::::");
        System.out.println("salário empregado: " + emp.calcularSalario());
        emp.setImposto(25.00);
        emp.setSalarioBase(3500.00);
        System.out.println("salário empregado (após SETs): " + emp.calcularSalario());
        System.out.println("emp.getImposto(): " + emp.getImposto() + "\nemp.getSalarioBase(): " + emp.getSalarioBase());
        System.out.println("::::::::::::::::::vvvvv Administrador vvvv:::::::::::::::::::");
        System.out.println("salario adm: " + adm.calcularSalario());
        System.out.println("::::::::::::::::::vvvvv Operario vvvv:::::::::::::::::::");
        System.out.println("salario op: " + op.calcularSalario());
        System.out.println("::::::::::::::::::vvvvv Vendedor vvvv:::::::::::::::::::");
        System.out.println("salario vend: " + vend.calcularSalario());








    }
}
