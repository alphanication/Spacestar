package com.alphanication.spacestar_base.ui.view_model

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle

fun SavedStateHandle.withArgs(defaultArgs: Bundle): SavedStateHandle {
    for (key in defaultArgs.keySet()) {
        this[key] = defaultArgs[key]
    }
    return this
}