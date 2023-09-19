package ca.test.mytestapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val firstName: String, val lastName: String) : Parcelable