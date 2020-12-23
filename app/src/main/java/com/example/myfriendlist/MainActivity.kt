package com.example.myfriendlist

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfriendlist.adapter.FriendsAdapter
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val friends = listOf(
            FriendDetail("Clay", "Dream", "DreamWasTaken@gmail.com", R.drawable.dreamwastaken),
            FriendDetail("George", "Davidson", "George@gmail.com", R.drawable.georgenotfounds),
            FriendDetail("Sapnap", "Nicholas", "Sapnap@gmail.com", R.drawable.sapnap),
            FriendDetail("Darryl", "Noveschosch", "Badboyhalo@gmail.com", R.drawable.badboyhalo),
            FriendDetail("Zek", "Ahmed", "Skeppy@gmail.com", R.drawable.skeppy),
            FriendDetail("Tobby", "Smith", "Tubbo@gmail.com", R.drawable.tubbo),
            FriendDetail("Floris", "Damen", "Fundy@gmail.com", R.drawable.fundy)
        )

        rv_friends.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = FriendsAdapter(friends) {
                startActivity(Intent(this@MainActivity, FriendsDetail::class.java))
            }
        }
    }
}