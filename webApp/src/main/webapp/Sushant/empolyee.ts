interface IEmployee{
    empCode:number;
    empName:string;
    getsalray:(number) => number;
    getEmpName(number):string;  // abstract function
}
let obj:IEmployee ={empCode:1,
                    empName:"Tarkeshwar",
                    getsalray(num):number{
                        return 100;
                    },
                    getEmpName(number):string{
                        return "Tarkeshwar";
                        }
                    };
console.log(obj.getEmpName(1));
console.log(obj);
console.log(obj.empCode);
console.log(obj.empName);