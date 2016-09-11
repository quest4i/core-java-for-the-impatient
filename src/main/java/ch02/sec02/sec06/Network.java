package ch02.sec02.sec06;

import java.util.ArrayList;

/**
 * Created on 2016. 9. 11. 오후 1:50.
 *
 * @author samyeong-gu
 */
public class Network {

    public class Member {

        private String name;
        private ArrayList<Member> friends = new ArrayList<>();

        private Member(String name) {
            this.name = name;
        }

        public void leave() {
            members.remove(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder(name);
            if (friends.isEmpty()) {
                return result.append(" has no friend").toString();
            }

            result.append(" with friends ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }


    private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
