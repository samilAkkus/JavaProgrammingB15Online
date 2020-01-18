package a_replit;

public class MethodsWithReturnValidate_175 {

    public static void main(String[] args) {

        System.out.println(validateTask(true,3,1));

    }

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){

        if(notEmpty == true) {

            if(taskId == currentId + 1){

                return true;
            }
        }

        return false;
    }
}
