package com.example.gulabatu

import androidx.lifecycle.ViewModel
import com.example.gulabatu.Data.ContactUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel: ViewModel() {
    private val _stateUIForm = MutableStateFlow(ContactUiState())
    val stateUIForm: StateFlow<ContactUiState> = _stateUIForm.asStateFlow()

    fun setContact(list: MutableList<String>) {
        _stateUIForm.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = list[0],
                alamat = list[1],
                tlp = list[2]
            )
        }
    }
}