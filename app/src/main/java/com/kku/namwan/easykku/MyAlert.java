package com.kku.namwan.easykku;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Namwan on 12/11/2559.
 */

public class MyAlert {

    //Explicit
    private Context context; //การต่อท่อ ไว้ส่ง data หากัน ระหว่าง object
    private int anInt;
    private  String titleString, messageString;

    public MyAlert(Context context, int anInt, String titleString, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public void myDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false); //ไม่สามารถกดปุ่ม unknown ได้ชั่วคราว
        builder.setIcon(anInt);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();


    } //myDialog
} //Main Class
