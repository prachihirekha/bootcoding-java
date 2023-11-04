package com.bootcoding.practice.method;

public class VotingAge {
    public static void main(String[] args) {
        VotingAge age=new VotingAge();
        age.votingAge(10);

    }
    public void votingAge(int i){

        if(i>18){
            System.out.println("he/she is eligible to vote " +i);
        }
        if(i<18){
            System.out.println("he/she is  not eligible to vote" + i);
        }
    }

}
