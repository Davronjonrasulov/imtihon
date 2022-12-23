package model;

import java.util.UUID;

public class Branches {

       public String brancheName;
       public UUID branchId;
       public String brancheAddress;
       public int brancheSince;

    public Branches() {
        this.branchId=UUID.randomUUID();
    }

    public Branches(String brancheName, String brancheAddress, int brancheSince) {
        this.brancheName = brancheName;
        this.brancheAddress = brancheAddress;
        this.brancheSince = brancheSince;
    }



}
