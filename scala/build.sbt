name := "scala-go-interop"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(ScalaNativePlugin)

nativeLinkingOptions := Seq("-L" + System.getenv("GOPATH") + "/src/github.com/charithe/scala-go-interop/go/", "--verbose")

