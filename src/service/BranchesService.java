package service;

import model.Branches;

public class BranchesService {

    public Branches[] brancheList=new Branches[100];
    private int index=0;

    public Branches checkBranche(String branchName){
        for (Branches branches: brancheList) {
            if (branches !=null){
                if(branches.brancheName.equals(branchName)){
                    return branches;
                }
            }
        }
        return null;
    }

    public boolean addBranche(String brancheName,String brancheAddress,int brancheSince){
        if (checkBranche(brancheName)==null){
            brancheList[index++]=new Branches(brancheName,brancheAddress,brancheSince);
            return true;
        }
        return false;
    }

}
