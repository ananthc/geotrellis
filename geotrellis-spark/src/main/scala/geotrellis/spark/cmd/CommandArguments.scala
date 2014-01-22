package geotrellis.spark.cmd

import com.quantifind.sumac.FieldArgs

class CommandArguments extends FieldArgs {
  var input: String = _
  var output: String = _
  var zoom: Int = _
}