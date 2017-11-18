package com.loftschool.moneymacker;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class ConfirmationDialog extends DialogFragment {

    private ConfirmationDialogListener listener = null;

    public void setListener(ConfirmationDialogListener listener) {
        this.listener = listener;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder
                .setCancelable(false)
                .setTitle(R.string.app_name)
                .setMessage("Вы точно хотите удалить выделенные элементы?")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onPositiveClick(dialog, which);
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onNegativeClick(dialog, which);
                    }
                });

        return builder.create();

    }
}
