package tk.therealsuji.vtopchennai.fragments.dialogs;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import tk.therealsuji.vtopchennai.R;
import tk.therealsuji.vtopchennai.activities.MainActivity;

public class CustomizeBackgroundDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new MaterialAlertDialogBuilder(requireContext())
                .setTitle("Customize Background")
                .setItems(new CharSequence[]{"Choose Image", "Remove Background"}, (dialog, which) -> {
                    MainActivity activity = (MainActivity) getActivity();
                    if (activity != null) {
                        if (which == 0) {
                            activity.chooseBackgroundImage();
                        } else {
                            activity.removeBackgroundImage();
                        }
                    }
                })
                .create();
    }
}
