package a_replit.Overriding1Education_232;

public class LawSchool extends EducationalInstitution {

    public LawSchool() {
        super(3);

    }

    @Override
    public String graduationRequirements() {
        return super.graduationRequirements() + " and passing the bar";
    }

    public static void main(String[] args) {


        LawSchool l1 = new LawSchool();

        System.out.println(l1.graduationRequirements());


    }
}
