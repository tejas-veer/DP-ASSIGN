package net.media.training.designpattern.adapter;
import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class LeaveRecordApdapter implements LeaveRecord{

    ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    LeaveRecordApdapter(ThirdPartyLeaveRecord thirdPartyLeaveRecord){
        this.thirdPartyLeaveRecord = thirdPartyLeaveRecord;
    }

    @Override
    public String getMostAbsentEmployee() {
        Employee employee =  thirdPartyLeaveRecord.getMostAbsentEmployee();
        return employee.getName();
    }


    @Override
    public int getEmployeeAbsences(String employeeName) {
        //logic
        return 0;
    }

    

    
}
