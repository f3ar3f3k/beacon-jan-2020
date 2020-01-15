import { Component, OnInit } from '@angular/core';

@Component( {
    selector: 'app-parent',
    templateUrl: './parent.component.html',
    styleUrls: ['./parent.component.css']
} )
export class ParentComponent implements OnInit {

    message: string;
    sender: string;
    response: object;

    constructor() { }

    ngOnInit() {
    }

    sendMessage() {
        this.message = "Good afternoon!";
        this.sender = "Parent component";
    }
    
    onReply(response){
        this.response  = response;
    }

}
