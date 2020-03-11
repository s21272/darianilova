
    public class telephone {

        public static void main(String[] args) {
            Telephone mom = new Telephone("IPhone", 2.5, 789123456);
            String brand = mom.getBrand();
            System.out.println("This phone is+ " + brand);
            double resolution = 2.5;
            System.out.println("Screen resolution is+ " + resolution + "in inches");
            float number =  789123456;
            System.out.println("The phone number is+ " + number);

        }
        class Telephone {
            String brand;
            double resolution;
            int number;

            public Telephone(String brand, double resolution, int number) {
                this.brand = brand;
                this.resolution=resolution;
                this.number=number;
            }
            public void SMS(String sms) {
                this.sms += sms;
            }
            public void sendSMS (String X, int Y) {
                System.out.println ("Send SMS + " +X + "to+ " +Y)
            }
        }
    }