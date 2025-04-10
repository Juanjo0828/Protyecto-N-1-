import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 
        Scanner sc = new Scanner(System.in);
        string NombreEmpleado="";
        string documentoEmpleado = "";
        string diadescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension =0;
        double deduccionSalud =0;
        double horasTrabajadas =0;
        double valorHora =0;
        double bonificacionEmpleado =0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte =200000;
        double valorHoraExtra =0;
        double CantidadHoraExtra =0;
        double TotalHoraExtra =0;

        System.out.println("ingrese el nombre del empleado:");
        NombreEmpleado= sc.nextLine();
        System.out.println("ingrese el documento del empleado:");
        documentoEmpleado= sc.nextLine();
        System.out.println("ingrese los dias de descanso:");
        diadescanso= sc.nextLine();
        System.out.println(s:"ingrese el valor de la hora");
        valorHora= sc.nextdouble();
        system.out.println(s:"ingrese la cantidad de horas trabajadas");
        horasTrabajadas= sc.nextline();
        
        salarioBruto = horasTrabajadas * valorHora;
        if(salarioBruto <= valorSalarioMinimo*2){
             /*si recibe auxilio de trsnaporte*/
             auxilioTransporte = 200000;
             bonificacionEmpleado = salarioBruto*0.1;
        } else {
             auxilioTransporte = 0;
             bonificacionEmpleado = 0;
        }
        deduccionPension = salarioBruto * 0.04;
        deduccionSalud = salarioBruto * 0.04;
        if(horasTrabajadas > 96){
            CantidadHoraExtra = horasTrabajadas - 96;
            valorHoraExtra = valorHora * 0.25 + valorHora;
            TotalHoraExtra = CantidadHoraExtra * valorHoraExtra;
        } else{
            CantidadHoraExtra = 0;
            valorHoraExtra = 0;
            TotalHoraExtra = 0;
        }
        if(horasTrabajadas < 24){
            system.out.println(s:"aun no le puedo pagar, trabaje mas")
        } else {
            salarioNeto = salarioBruto - deduccionPension - deduccionSalud+auxilioTransporte + bonificacionEmpleado + TotalHoraExtra;
            system.out.println("el salario neto del empleado es :" = salarioBruto)
            system.out.println("el nombre del empleado es :" = NombreEmpleado)
            system.out.println("")
        }   
        }



}      




