package com.example.assignmentinternship.presentation.Screen

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignmentinternship.R

@Composable
fun ProfileScreen(viewModel: ProfileViewModel = viewModel(), modifier: Modifier=Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0A0A0A))
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column(modifier = Modifier.background(Color(0xFF222222))
                .padding(start = 21.dp, end = 16.dp)) {

                TopBar()
                Spacer(modifier = Modifier.height(25.dp))


                // Profile row
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_account_circle_24),
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(67.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(13.dp))
                    Column {
                        Text(
                            text = viewModel.userName,
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "member since ${viewModel.memberSince}",
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .border(1.dp, Color.DarkGray, CircleShape)
                                .padding(5.dp)
                                .width(32.dp)
                                .height(32.dp),
                            contentAlignment = Alignment.Center,
                        ) {

                            Icon(
                                modifier = Modifier,
                                painter = painterResource(id = R.drawable.round_edit_24),
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(1.dp))

                // CRED Garage section
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                            .border(1.dp, Color.DarkGray)
                            .fillMaxWidth()
                            .background(Color(0xFF0A0A0A))
                            .padding(18.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .border(1.dp, Color.DarkGray, CircleShape)
                                .padding(7.dp)
                                .width(19.dp)
                                .height(19.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_directions_car_filled_24),
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                "get to know your vehicles, inside out",
                                color = Color.Gray,
                                fontSize = 13.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    "CRED garage",
                                    color = Color.White,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24),
                                    contentDescription = null,
                                    tint = Color.Gray
                                )

                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(28.dp))
//     CREDIT SCORE SECTION
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp)
                        ,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .border(1.dp, Color.DarkGray, CircleShape)
                            .padding(1.dp)
                            .width(14.dp)
                            .height(14.dp),
                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            painter = painterResource(id = R.drawable.round_credit_score_meter_24),
                            contentDescription = "",
                            tint = Color.Gray
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("credit score", color = Color.White, fontSize = 14.sp)
                    Text("  ·  R E F R E S H  A V A I L A B L E", color = Color(0xFF00FF00), fontSize = 10.sp,
                        fontWeight = FontWeight.Bold)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(viewModel.creditScore.toString(), color = Color.White, fontSize = 14.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            modifier = Modifier.clickable { },
                            painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24),
                            contentDescription = null,
                            tint = Color.Gray
                        )

                    }
                }



                Divider(
                    color = Color.DarkGray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 0.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                InfoRow(
                    "lifetime cashback",
                    "₹${viewModel.lifetimeCashback}",
                    R.drawable.baseline_currency_rupee_24
                )
                Divider(
                    color = Color.DarkGray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 0.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                InfoRow("bank balance", "check", R.drawable.baseline_bank_balance_24)

                Spacer(modifier = Modifier.height(10.dp))
            }

            Column(modifier = Modifier.padding(start = 21.dp, end = 16.dp)) {
                Spacer(modifier = Modifier.height(24.dp))
                Text("Y O U R  R E W A R D S  &  B E N E F I T S", color = Color.Gray, fontSize = 12.sp, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(10.dp))
                RewardRow("cashback balance", "₹${viewModel.cashbackBalance}", true)
                Divider(
                    color = Color.DarkGray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 0.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                RewardRow("coins", "%,d".format(viewModel.coins), true)
                Divider(
                    color = Color.DarkGray,
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 0.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                RewardRow("win upto Rs 1000", "refer and earn", true)

                Spacer(modifier = Modifier.height(34.dp))

                Text("T R A N S A C T I O N S  &  S U P P O R T", color = Color.Gray, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                RewardRow("all transactions", "", true)

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF222222))
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.weight(0.7f)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "Back",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text("Profile", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
        }

        Box(modifier = Modifier
            .clip(CircleShape)
            .border(1.dp, Color.DarkGray, CircleShape)
            .weight(0.3f)
            .padding(5.dp),
            contentAlignment = Alignment.Center) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.outline_message_24),
                    contentDescription = "Support",
                    tint = Color.Gray
                )

                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    "support",
                    color = Color.Gray,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            }
            }
    }
}

@Composable
fun InfoRow(label: String, value: String, @DrawableRes drawableRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
            .padding(start = 0.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(modifier = Modifier
            .clip(CircleShape)
            .border(1.dp, Color.DarkGray, CircleShape)
            .padding(1.dp)
            .width(14.dp)
            .height(14.dp),
            contentAlignment = Alignment.Center) {

            Icon(
                painter = painterResource(id = drawableRes),
                contentDescription = "",
                tint = Color.Gray
            )
        }
        Spacer(modifier = Modifier.width(8.dp))

        Text(label, color = Color.White, fontSize = 14.sp)
        Row(modifier = Modifier.fillMaxWidth(),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) {
            Text(value, color = Color.White, fontSize = 14.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_right_alt_24), contentDescription = null, tint = Color.Gray)

        }
    }
}

@Composable
fun RewardRow(title: String, subtitle: String = "", showArrow: Boolean = false) {
    Row(modifier = Modifier
        .padding(start = 0.dp)) {
        Column(
            modifier = Modifier
                .padding(vertical = 12.dp)
                .clickable(enabled = showArrow) {},
        ) {
            Text(title, color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(4.dp))
            Text(subtitle, color = Color.Gray, fontSize = 12.sp)
        }

        if (showArrow) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_keyboard_arrow_right_24),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
        }
    }
}