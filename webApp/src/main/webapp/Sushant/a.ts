class Employee implements IEmployee {
    empCode: number;
    empName: string;
    constructor(empCode: number, empName: string) {
        this.empCode = empCode;
 
    }
    getsalray(num): number {
        return 100;
    }
    getEmpName(number): string {
        return "Tarkeshwar";
    }
}