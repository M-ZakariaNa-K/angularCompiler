import {Component,onInit}  from "angular/core";
import fetchApi from "../../api/fetchApi";
import "my/module";



enum ROLE  {
    ADMIN="admin",
    EMPLOYEE="employee"
}

const name1:string = "dwawad";
var name2:string = "dwawad";
let name3:string = "dwawad";

let counter:number = 5;
counter + 1;

interface user {
    name:string;
    role:ROLE
}

const api_url = (id:number):string => "localhost:3000/api/user/getname/" + id

const getName = (url:string):unknwon => {
    try {


        const response:response  = fetchApi(url);
        return response;
    } catch (ex:Expeption) {
        return null;
    } finally {
        return null;
    }
}

class employee implements user {
    private name:string;
    private role:ROLE = "employee";
    id:number;
    constructor (name:string,role:ROLE,id:number) {
        this.name = name;
        this.role = role;
        this.id = id;
    }

@Component({
    selector: "employeeCard",
    template: "<div>{{name}}</div>",
    templateUrl: "./employee.html",
    styles: ["h1 { color: red; }", "p { font-size: 14px; }"],
    styleUrls: ["./employee.css", "./shared.css"]
})
class userCard {
    name: string;

    ngOnInit(): any {
        this.name = getName(api_url);
    }
}
