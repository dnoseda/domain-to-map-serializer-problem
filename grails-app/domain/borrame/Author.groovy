package borrame

class Author {
	String name
	String city
	static hasMany = [books:Book]


    static constraints = {
    }
}
