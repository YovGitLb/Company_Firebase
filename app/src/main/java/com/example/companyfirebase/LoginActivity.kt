package com.example.companyfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_login.*

@Suppress("UNUSED_PARAMETER")
class LoginActivity : AppCompatActivity() {


    private lateinit var txtusers: TextInputEditText
    private lateinit var txtpass: TextInputEditText
    private lateinit var btnLogin:Button
    private lateinit var progress:ProgressBar





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtusers=findViewById(R.id.txtuser)
        txtpass=findViewById(R.id.txtpassword)
        btnLogin=findViewById(R.id.btnIniciar)
        progress=findViewById(R.id.progressBar)




    }

    fun Ingresar(view: View){

        progress.visibility= View.VISIBLE
        btnIniciar.visibility=View.GONE
        startActivity(Intent(this,MainActivity::class.java))
    }

    fun forget(view:View){

       txtSend.visibility=View.GONE
        progress.visibility= View.VISIBLE
        startActivity(Intent(this,ForgetActivity::class.java))


    }

    fun registrarme(view: View){

        txtregister.visibility=View.GONE
        progress.visibility= View.VISIBLE
        startActivity(Intent(this,RegisterActivity::class.java))
    }

}
