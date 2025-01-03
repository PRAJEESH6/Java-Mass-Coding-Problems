//
///*
// Write a Java program to create a class called "GymMembership" with attributes for member name,
// membership type, and duration. Create a subclass "PremiumMembership" that adds attributes for
// personal trainer availability and spa access. Implement methods to calculate membership fees
// and check for special offers based on membership type.
// */
//
//class GymMembership{
//
//    String Member_Name;
//    String MemberShip_Type;
//    int Member_Duration;
//
//    GymMembership(String Member_Name,String MemberShip_Type,int Member_Duration)
//    {
//        this.Member_Name = Member_Name;
//        this.MemberShip_Type = MemberShip_Type;
//        this.Member_Duration = Member_Duration;
//    }
//
//    public double Fees_Calculation()
//    {
//        double month = 300.00;
//        return month *  Member_Duration;
//    }
//
//    public void Special_Offers()
//    {
//
//    }
//}
//
//class PremiumMembership {
//
//    int personal_trainer_availability;
//    int spa_access;
//
//}
//
//public class OOps {
//    public static void main(String args[])
//
//    {
//        System.out.println("Hello Prajeesh..");
//
//        GymMembership gymMembership = new GymMembership("ram","non-premium",30);
//        gymMembership.Fees_Calculation();
//    }
//}
//
