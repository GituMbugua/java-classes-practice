/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midsem;

import java.util.Scanner;

/**
 *
 * @author Gitu
 */
public class STUDENT extends PERSON {
    Scanner s = new Scanner(System.in);
    private int quizScore, midScore, finScore, totalscore;
    
    STUDENT(String id, String name, String tel, int qscore, int mscore, int fscore) {
        super(id, name, tel);
        setquiz(qscore);
        setmid(mscore);
        setfinal(fscore);
    }
    
    public void setquiz(int qz) {
        boolean validate = true;
        do {
            if (qz <= 50) {
                quizScore = qz;
                break;
            } else { 
                System.out.println("Invalid quiz score.");
                System.out.println("Enter quiz score: ");
                setquiz(s.nextInt());
                validate = false;
            }
        } while (validate);
    }
    
    public void setmid(int mid) {
        boolean validate = true;
        do {
            if (mid <= 20) {
                midScore = mid;
                break;
            } else { 
                System.out.println("Invalid mid-semester exam score.");
                System.out.println("Enter mid-semester exam score: ");
                setmid(s.nextInt());
                validate = false;
            }
        } while (validate);
    }
    public void setfinal(int fin) {
        boolean validate = true;
        do {
            if (fin <= 30) {
                finScore = fin;
                break;
            } else { 
                System.out.println("Invalid final exam score.");
                System.out.println("Enter final exam score: ");
                setfinal(s.nextInt());
                validate = false;
            }
        } while (validate);
    }
    
    public int totalscore() {
        return quizScore + midScore + finScore;
    }
    
    public int getquiz() {
        return quizScore;
    }
    
    public int getmid() {
        return midScore;
    }
    
    public int getfin() {
        return finScore;
    }
    
    
    @Override
    public String toString() {
        return "==========================================\n"
                + "Number: \t " + getidnum()
                + "\nName: \t\t " + getname()
                + "\nTelephone: \t " + gettelno()
                + "\nAddress: \t " + getaddress()
                + "\nQuiz: \t\t " + quizScore
                + "\nMid: \t\t" + midScore
                + "\nFinal: \t\t " + finScore
                + "\nTotal Score: \t " + totalscore()
                + "\n==========================================";
        }
    }
