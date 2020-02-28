package day61;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {


        List<Job> jobs = new LinkedList<>();
        jobs.add(new Job("Seattle" , 120000 , "Amazon"));
        jobs.add(new Job("Florida" , 110000 , "Apple"));
        jobs.add(new Job("WashingtonDC" , 90000 , "BAO"));
        jobs.add(new Job("SanDiego" , 140000 , "CineTech"));
        jobs.add(new Job("SanFrancisco" , 150000 , "Microsoft"));

        System.out.println("BEFORE: " +jobs);

        Collections.sort(jobs);

        System.out.println("AFTER"+jobs);
    }
}
