package com.application.formosity_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class CreateAccount : AppCompatActivity() {

    private lateinit var editUsername: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var editConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
    }
}
