package main

import (
	"C"
	"fmt"
)

//export SayHello
func SayHello(name *C.char) *C.char {
	retVal := fmt.Sprintf("Hello %s", C.GoString(name))
	return C.CString(retVal)
}

func main() {}
