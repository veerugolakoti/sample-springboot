package selfAssessment;

public class GenerateOtp {
    public void generateOTP(){
        String randomNumber= String.valueOf((int)(Math.random()*900000)+1);
        System.out.println(randomNumber);
    }
}
