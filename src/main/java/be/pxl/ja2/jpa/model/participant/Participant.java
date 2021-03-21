package be.pxl.ja2.jpa.model.participant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participant {
	@Id
	private String uid;
	private String name;
	private String email;

	public Participant() {
	}

	public Participant(String uid, String name, String email) {
		this.uid = uid;
		this.name = name;
		this.email = email;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Participant{" +
				"uid='" + uid + '\'' +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
