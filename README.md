# CA-Post


Compose NavHost:  to navigate from screen 1 to 2 and User Data is passed back to screen 1

Set User Data:  NavHostController.previousBackStackEntry?.savedStateHandle?.set(
                "key1", <User>)

Get User Data:  NavBackStackEntry.savedStateHandle.get<User>(KEY)?: null  

@Parcelize
class User(val firstName: String, val lastName: String) : Parcelable

Test Video

https://github.com/raj-k-goud/CA-Post/assets/70549776/d6e410e5-8089-4775-9e8f-f3ee2dbb49f8

