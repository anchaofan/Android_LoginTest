//package com.example.logintest14
//
//import android.os.Bundle
//import android.util.Log
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//    private val TAG = "tag"
//    private lateinit var btnLogin: Button
//    private lateinit var etAccount: EditText
//    private lateinit var etPassword:EditText
//
//    private val userName = "abc"
//    private val pass = "123"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        supportActionBar!!.title = "登录"
//        btnLogin = findViewById(R.id.btn_login)
//        etAccount = findViewById(R.id.et_account)
//        etPassword = findViewById<EditText>(R.id.et_password)
//        btnLogin.setOnClickListener(View.OnClickListener {
//            val account = etAccount.getText().toString()
//            val password: String = etPassword.getText().toString()
//            Log.d(TAG, "onClick: -------------$account")
//            Log.d(TAG, "password: -------------$password")
//            if (account == userName) {
//                if (password == pass) {
//                    Toast.makeText(this@MainActivity, "恭喜你，登陆成功！", Toast.LENGTH_LONG).show()
//                } else {
//                    Toast.makeText(this@MainActivity, "密码错误！", Toast.LENGTH_LONG).show()
//                }
//            } else {
//                Toast.makeText(this@MainActivity, "用户名错误！", Toast.LENGTH_LONG).show()
//            }
//        })
//    }
//}