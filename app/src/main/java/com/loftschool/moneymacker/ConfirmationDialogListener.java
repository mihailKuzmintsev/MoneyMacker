package com.loftschool.moneymacker;


import android.app.DialogFragment;
import android.content.DialogInterface;

public interface ConfirmationDialogListener {

    void onPositiveClick(DialogInterface dialog, int button);
    void onNegativeClick(DialogInterface dialog, int button);
}
