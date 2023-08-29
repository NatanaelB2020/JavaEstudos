public class Switch {
    public static void main(String[] args) {
        int valor = 50;

        switch (valor){
            case 10:{
                System.out.println(" é 10");
                System.out.println("primeiro");
                break;
            }
            case 20:{
                System.out.println(" é 20");
                System.out.println(" segundo");
                break;
            }
            case 22:{
                System.out.println(" é 22");
                System.out.println(" terceiro");
                break;
            }
            default: {
                System.out.println(" não é nenhum dos valores esperados");
            }

        }
        System.out.println(" programa continua");
    }
}
