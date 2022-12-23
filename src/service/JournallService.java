package service;

import model.Journall;

public class JournallService {
     public Journall[] journallList=new Journall[100];
    public int index=0;
    public boolean addSign(String subject ,String sign,String studentSurname, String studentName ){
        for (Journall journall : journallList){
            if (journall!=null){
                if (journall.subject.equals(subject)){
                    return false;
                }
            }
        }
        journallList[index++]=new Journall(subject,sign,studentSurname,studentSurname);
        return true;
    }

}
