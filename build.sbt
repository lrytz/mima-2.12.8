import com.typesafe.tools.mima.core._

mimaPreviousArtifacts := Set("0.0.1-SNAPSHOT") map { v => organization.value %% name.value % v }
