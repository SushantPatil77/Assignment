var Employee = /** @class */ (function () {
    function Employee(empCode, empName) {
        this.empCode = empCode;
    }
    Employee.prototype.getsalray = function (num) {
        return 100;
    };
    Employee.prototype.getEmpName = function (number) {
        return "Tarkeshwar";
    };
    return Employee;
}());
