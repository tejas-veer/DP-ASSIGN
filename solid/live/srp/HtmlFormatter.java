package solid.live.srp;

public class HtmlFormatter{
    public static String toHtml(Employee emp) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getEmpId() + "'>" +
                "<span>" + emp.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left:</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.getTotalLeaveAllowed() - emp.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(emp.getMonthlySalary() * 12) + "</span>";
        if (emp.getManager() != null) str += "<span>" + emp.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (emp.getYearsInOrg() < 3) {
            years = emp.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        int[] leavesLeftPreviously = emp.getLeavesLeftPreviously();
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[emp.getYearsInOrg() - i - 1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }

}
