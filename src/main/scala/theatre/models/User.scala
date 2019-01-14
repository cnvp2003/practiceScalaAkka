package theatre.models

import java.util.{Date, UUID}

/**
  * Created by pati80 on 03/11/2018.
  */

case class User(id: UUID = UUID.randomUUID(), name: String, dateOfBirth: Date, contactNo: String, emailId: String, sex: String)