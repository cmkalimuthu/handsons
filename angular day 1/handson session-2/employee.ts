export interface Employee{
    id:number;
    name:string;
    salary:number;
    permanent:boolean;
}
import { Department } from "./department";
export var department:Department={
    id:1,
    name:"pay-roll"
};
import { Skills} from "./skill";
export var skills:Skills[]=[{
    id:1,
    name:"html"

},
{
    id:2,
    name:"css"
}
];