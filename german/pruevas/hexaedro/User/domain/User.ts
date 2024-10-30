import { UserId } from "./UserId";

export class User{
    id: UserId; 
    name: String;
    email: String;
    createdAt: Date;

    contructor(id: UserId, name: String, email: String, createdAt: Date){
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public nameAndEmail(){
        return  `${this.name} - ${this.email}`;
    }


}

