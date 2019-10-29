package com.example.companyfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

@Suppress("UNUSED_PARAMETER")
class RegisterActivity : AppCompatActivity() {


    private lateinit var txtname:TextInputEditText
    private lateinit var txtlastname:TextInputEditText
    private lateinit var txtemail:TextInputEditText
    private lateinit var txtpass:TextInputEditText
    private lateinit var txt_reppass:TextInputEditText
    private lateinit var progress:ProgressBar
    private lateinit var btnValidar:Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        txtname=findViewById(R.id.txtName)
        txtlastname=findViewById(R.id.txtLastname)
        txtemail=findViewById(R.id.txtEmail)
        txtpass=findViewById(R.id.txtPass)
        txt_reppass=findViewById(R.id.txtRepPass)
        btnValidar=findViewById(R.id.btnRegister)
        progress=findViewById(R.id.progressBar2)





    }

    fun register(view: View)
    {
        ValidationEmpty()

    }


    private fun ValidationEmpty(){
        val name:String=txtname.toString()
        val lastname:String=txtlastname.toString()
        val email:String=txtemail.toString()
        val pass:String=txtpass.toString()
        val reppass:String=txt_reppass.toString()

        if(!TextUtils.isEmpty(name)&& !TextUtils.isEmpty(lastname)&&!TextUtils.isEmpty(email)&& !TextUtils.isEmpty(pass)&& !TextUtils.isEmpty(reppass)) {
            showProgress()
            Toast.makeText(this, "Welcome my Aplication", Toast.LENGTH_LONG).show()

            startActivity(Intent(this, LoginActivity::class.java))
        }

        else{

            Toast.makeText(this,"Completar los campos",Toast.LENGTH_LONG).show()

        }


    }

     fun showProgress(){
        btnValidar.visibility=View.GONE
         progress.visibility=View.VISIBLE
    }




}
