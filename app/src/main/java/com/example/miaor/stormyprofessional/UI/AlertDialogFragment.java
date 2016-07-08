package com.example.miaor.stormyprofessional.UI;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.example.miaor.stormyprofessional.R;

/**
 * created by the one and only, Runkun Miao!!!!!!!!!
 */
public class AlertDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.sorry))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.OK), null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
